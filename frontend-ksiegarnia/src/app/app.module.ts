import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import {HttpClientModule} from "@angular/common/http";
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MainPanelComponent } from './Components/main-panel/main-panel.component';
import { BottomBarComponent } from './Components/bottom-bar/bottom-bar.component';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatButtonModule } from '@angular/material/button';
import { MatIconModule } from '@angular/material/icon';
import { MatCardModule } from '@angular/material/card';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { LoginComponent } from './Components/login/login.component';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { MatFormFieldModule } from '@angular/material/form-field';
import {FlexLayoutModule} from "@angular/flex-layout"
import { MatRadioModule } from '@angular/material/radio';
import {MatInputModule} from "@angular/material/input";
import { RegisterComponent } from './Components/register/register.component';
import {MatSnackBarModule} from '@angular/material/snack-bar';
import { HomePageComponent } from './Components/home-page/home-page.component';

@NgModule({
  declarations: [
    AppComponent,
    MainPanelComponent,
    BottomBarComponent,
    LoginComponent,
    RegisterComponent,
    HomePageComponent,

  ],
    imports: [
        BrowserModule,
        AppRoutingModule,
        MatToolbarModule,
        MatButtonModule,
        MatIconModule,
        MatCardModule,
        BrowserAnimationsModule,
        FormsModule,
        MatFormFieldModule,
        MatRadioModule,
        MatInputModule,
        FlexLayoutModule,
        HttpClientModule,
        MatSnackBarModule,
        ReactiveFormsModule
    ],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
