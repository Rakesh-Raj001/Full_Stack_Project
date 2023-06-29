import { Component, OnInit } from '@angular/core';
import { UserService } from '../services/User.service';
import { UserSignUp } from '../user-sign-up';
import { UserLogIn } from '../user-log-in';
import { Router } from '@angular/router';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
 userSignUp:UserSignUp=new UserSignUp();
userLogIn:UserLogIn=new UserLogIn();
 constructor(private userService:UserService, private router:Router){}

  ngOnInit(): void {
      }
  signUp(){
 this.userService.signUp(this.userSignUp).subscribe(response=>{
  console.log(response);
  alert("SignUp is Successful you can login");
 }, error=>{
  console.log(error);
 }
 )
  }
  logIn(){
    this.userService.logIn(this.userLogIn).subscribe(response=>{
      console.log(response);
      this.router.navigateByUrl('/home');
     }, error=>{
      alert("UserName or Password is invalid");
     }
     )
  }
}