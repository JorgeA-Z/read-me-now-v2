import { Component } from '@angular/core';
import { BookShelfPageComponent } from "../../components/book-shelf/book-shelf.component";

@Component({
  selector: 'app-home-page',
  standalone: true,
  imports: [BookShelfPageComponent],
  templateUrl: './home-page.component.html',
  styleUrl: './home-page.component.css'
})
export class HomePageComponent {

}
