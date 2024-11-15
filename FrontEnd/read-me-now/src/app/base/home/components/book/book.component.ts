import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-book',
  standalone: true,
  imports: [],
  templateUrl: './book.component.html',
  styleUrl: './book.component.css'
})
export class BookComponent {

  @Input() public name: string = ''
  @Input() public cover: string = ''
  @Input() public authorName: string = ''
  @Input() public authorLastName: string = ''
  

  

}
