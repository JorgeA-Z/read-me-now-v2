import { Routes } from '@angular/router';

export const routes: Routes = [
    {
        path: '',
        loadChildren: () => import('./base/auth/routes/auth.routing').then((m) => m.routes)
    },
    {
        path: 'home',
        loadChildren: () => import('./base/home/routes/home.routing').then((m) => m.routes)
    }
];
