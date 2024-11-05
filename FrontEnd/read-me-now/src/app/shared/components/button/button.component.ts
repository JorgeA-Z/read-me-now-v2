import { CommonModule } from '@angular/common';
import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-button',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './button.component.html',
  styleUrl: './button.component.css'
})
export class ButtonComponent {

  @Input() public type: 'primary' | 'secondary' | 'dark' = 'primary';
  
  @Input() public lable: string = ''

  @Input() public size: 'sm' | 'md' | 'lg' = 'sm';

  public get classes(): string[]
  {
    let mode = ''

    switch(this.type)
    {
      case('primary'):
        mode = 'button-primary ';
        break;

      case('secondary'):
        mode = 'button-secondary ';
        break;

      default:
        mode = 'button-primary ';
        break;
    }

    switch(this.size)
    {
      case('sm'):
        mode += 'button-sm ';
        break;

      case('md'):
        mode += 'button-md ';
        break;
      case('lg'):
        mode += 'button-lg ';
        break;

      default:
        mode += 'button-sm ';
        break;
    }

    return ['button-base', mode]

  }

}
