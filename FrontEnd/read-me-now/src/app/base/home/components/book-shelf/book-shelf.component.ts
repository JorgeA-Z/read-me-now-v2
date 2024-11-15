import { Component, inject, OnInit } from '@angular/core';
import { Book } from '../../interfaces/book';
import { BookService } from '../../services/book.service';
import { BookComponent } from '../book/book.component';
@Component({
  selector: 'app-book-shelf-page',
  standalone: true,
  imports: [BookComponent],
  templateUrl: './book-shelf.component.html',
  styleUrl: './book-shelf.component.css'
})
export class BookShelfPageComponent implements OnInit{


  public bookList: Book[] = [];
	public totalElements: number = 0;
  public pageNumber:    number = 0;
  public totalPages:    number = 0;

  private bookService: BookService = inject(BookService)
  
  ngOnInit(): void {
    console.log("asdknflsadnf")
    this.getBookList();
  }

  private getBookList(pageNumber: number = 0, pageSize: number = 25, active: boolean = true): void{
    this.bookService.getBookList(pageNumber, pageSize, active).subscribe({
      next: (data) => {
        this.bookList = data.data
        this.totalElements = data.totalElements
        this.pageNumber = data.pageNumber
        this.totalPages = data.totalPages
      },
      error: (error) => {
        //TODO: Crear una notificacion para los cambios de estado
      },
      complete: () => {
        //TODO: Crear una notificacion para los cambios de estado
      }
    })
  }

}
