import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'
import { UserSignUp } from '../user-sign-up';
import { Observable } from 'rxjs';
import { UserLogIn } from '../user-log-in';
@Injectable({
  providedIn: 'root'
})
export class UserService {
  getProduct() {
    throw new Error('Method not implemented.');
  }
  url:string="http://localhost:8088/user/register";
  url1:string="http://localhost:8088/api/v1/login";
  constructor(private http:HttpClient) { }
  signUp(data:UserSignUp):Observable <Object> {
    return this.http.post(this.url,data);
    
  }
  logIn(data:UserLogIn): Observable<Object>{
    return this.http.post(this.url1, data)
  }
}
