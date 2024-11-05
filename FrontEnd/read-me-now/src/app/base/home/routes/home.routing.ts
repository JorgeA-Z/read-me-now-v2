import { Routes } from '@angular/router';
import { LayoutPageComponent } from '../../../layout/pages/layout-page/layout-page.component';
import { HomePageComponent } from '../pages/home-page/home-page.component';

export const routes: Routes = [
  {
    path: '',
    component: LayoutPageComponent,
    children: [
      {
        path: 'discovery',
        component: HomePageComponent
      }
    ]
  }


];