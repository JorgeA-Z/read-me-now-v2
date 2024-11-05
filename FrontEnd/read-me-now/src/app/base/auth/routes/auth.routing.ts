import { Routes } from '@angular/router';
import { LoginFormComponent } from '../components/login-form/login-form.component';
import { RegisterFormComponent } from '../components/register-form/register-form.component';
import { AuthPageComponent } from '../pages/auth-page/auth-page.component';

export const routes: Routes = [
  {  
    path: '',
    component: AuthPageComponent,
  },
  {
    path: 'log-in',
    component: LoginFormComponent,
  },
  {
    path: 'register',
    component: RegisterFormComponent,
  }
];