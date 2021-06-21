import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ViewUserInfoComponent } from './view-user-info/view-user-info.component';
import { DisplayContainerComponent } from './display-container/display-container.component';

const routes: Routes = [
  {path:'Users/:id',component:ViewUserInfoComponent},
  {path:'',component:DisplayContainerComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
