import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ViewUserInfoComponent } from './view-user-info/view-user-info.component';
import { DisplayContainerComponent } from './display-container/display-container.component';
import { EditUserInfoComponent } from './edit-user-info/edit-user-info.component';

const routes: Routes = [
  {path:'Users/:id',component:ViewUserInfoComponent},
  {path:'Users',component:DisplayContainerComponent},
  {path: 'Users/edit/:id',component:EditUserInfoComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
