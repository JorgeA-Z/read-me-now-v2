import firebase_admin
from firebase_admin import credentials, firestore
class readMeNowBookfirebaseMannagerApp():
    def __init__(self, auth):
        self.cred = credentials.Certificate(rf'{auth}')
        self.books = list()
        self.autors = list()
        self.autorKeys = dict();
        firebase_admin.initialize_app(self.cred)
        self.db = firestore.client()

    def extract_collections(self):
        coleccion_ref = self.db.collection('Libro')
        bookDocuments = coleccion_ref.stream()
        for doc in bookDocuments:
            book = doc.to_dict()
            self.extract_book_autor(book['Autor'])
            self.books.append(book)

    def extract_book_autor(self, autor_ref):
        doc = autor_ref.get()
        autor = doc.to_dict()
        if autor not in self.autors:
            self.autorKeys[autor_ref] = [autor, len(self.autors)+1]
            self.autors.append(autor)

    def format_autor_sql(self, autor, autor_id):
        url = autor['Url']
        nombre = autor['Nombre']
        apellido = autor['Apellido']
        about = autor['About']
        sql_query = f"""INSERT INTO author (author_id, about, name, lastname, cover, created_at, modified_at, is_active) VALUES ({autor_id}, '{about}', '{nombre}', '{apellido}', '{url}', NOW(), NOW(), true);"""            
        return sql_query

    def format_book_sql(self, book, autor_id, book_id):
        name = book['Nombre']
        cover = book['Caratula']
        about = book['About']
        genre = book['Genero']
        subGenre = book['Subgenero']
        likes = book['Likes']
        url = book['Url']
        sql_query = f"""INSERT INTO book (book_id, about, author_id, genre, subGenre, name, url, cover, likes, is_active, created_at, modified_at, read_global_time) VALUES ({book_id}, '{about}', {autor_id}, '{genre}', '{subGenre}', '{name}', '{url}', '{cover}', {likes}, true, NOW(), NOW(), '00:00:00');"""
        return sql_query            

    def generate_autor_sql(self):
        sql_duplicates = list()
        for book in self.books:
            sql_duplicates.append(self.format_autor_sql(self.autorKeys[book['Autor']][0], self.autorKeys[book['Autor']][1]))

        sql_querys = set(sql_duplicates)
        for sql_query in sql_querys:
            self.write_data_sql(sql_query)

    def generate_book_sql(self):
        book_id = 1
        for book in self.books:
            self.write_data_sql(self.format_book_sql(book, self.autorKeys[book['Autor']][1], book_id))
            book_id +=1

    def write_data_sql(self, sql_querry):
            f = open(f'data.sql', "a", encoding='utf-8')
            f.write(sql_querry+ '\n')
            f.close()

    def generateSql(self):
        self.extract_collections()
        self.generate_autor_sql()
        self.generate_book_sql()

if __name__ == "__main__":
    manager = readMeNowBookfirebaseMannagerApp(r'C:\Users\jorge_zepeda\Desktop\ReadMeNowV2\Manager\readmynow-87dfb-firebase-adminsdk-3o6t1-e6a460dd78.json')
    manager.generateSql()