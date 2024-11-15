import { HttpClient, HttpParams } from '@angular/common/http';
import { inject, Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from '../../../environments/environment.development';
import { Book } from '../interfaces/book';
import { DataList } from '../interfaces/dataList';


@Injectable({
  providedIn: 'root'
})
export class BookService {
  private httpClient: HttpClient = inject(HttpClient);

  public getBookList(pageNumber: number = 0, pageSize: number = 25, active: boolean = true): Observable<DataList<Book>>{
    const url = `${environment.apiUrl}books`;
    const params = new HttpParams().set('pageNumber', `${pageNumber}`).set('pageSize', `${pageSize}`).set('active', active);
		return this.httpClient.get<DataList<Book>>(url, {params});
  }

}
