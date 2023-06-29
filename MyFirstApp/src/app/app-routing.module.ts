import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { CategoryComponent } from './category/category.component';
import { CartComponent } from './cart/cart.component';
import { LoginComponent } from './login/login.component';



const routes: Routes = [

  {
    path:'',
    component:LoginComponent
      },
      {path:'category',
    component:CategoryComponent
  },
    {
path:'cart',
component: CartComponent
    },
    {
      path:'login',
      component: LoginComponent
          },
          {
            path:'home',
            component: HomeComponent
                }
    
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
