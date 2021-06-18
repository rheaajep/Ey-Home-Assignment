import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { UserCardComponent } from './user-card/user-card.component';
import { DisplayContainerComponent } from './display-container/display-container.component';
import { ViewButtonComponent } from './view-button/view-button.component';
import { EditButtonComponent } from './edit-button/edit-button.component';
import {HttpClientModule} from '@angular/common/http';
import { ViewUserInfoComponent } from './view-user-info/view-user-info.component';
import { EditUserInfoComponent } from './edit-user-info/edit-user-info.component';

@NgModule({
  declarations: [
    AppComponent,
    UserCardComponent,
    DisplayContainerComponent,
    ViewButtonComponent,
    EditButtonComponent,
    ViewUserInfoComponent,
    EditUserInfoComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
