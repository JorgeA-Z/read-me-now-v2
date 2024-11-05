import { Component } from '@angular/core';
import { ButtonComponent } from '../../../../shared/components/button/button.component';
import { GoBackButtonComponent } from '../../../../shared/components/go-back-button/go-back-button.component';
import { InputComponent } from '../../../../shared/components/input/input.component';

@Component({
  selector: 'app-register-form',
  standalone: true,
  imports: [ButtonComponent, InputComponent, GoBackButtonComponent],
  templateUrl: './register-form.component.html',
  styleUrl: './register-form.component.css'
})
export class RegisterFormComponent {

}
