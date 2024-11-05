import { CommonModule } from '@angular/common';
import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-input',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './input.component.html',
  styleUrl: './input.component.css'
})
export class InputComponent {
  @Input() public type: 'primary' | 'secondary' | 'dark' = 'primary';

  @Input() public lable: string = ''

  public get classes(): string[]
  {
    let mode = ''

    switch(this.type)
    {
      case('primary'):
        mode = 'input-primary';
        break;

      case('secondary'):
        mode = 'input-secondary';
        break;

      default:
        mode = 'input-primary';
        break;
    }

    return ['input-base', mode]

  }

}
