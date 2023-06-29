import { Component, OnInit } from '@angular/core';
import { UserService } from '../services/User.service';
import { CartService } from '../services/cart.service';
@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit{
  constructor(private cartService:CartService){}
  ngOnInit(): void {
    
  }
  addtocart(item: any){
    this.cartService.addtoCart(item);
  }
  
  

  url: string = "../assets/m4.jpg";
    imageChange(event: any){
        this.url = event.target.src;
}
url1: string = "../assets/L4.jpg";
    imageChange1(event: any){
        this.url1=event.target.src;
}
url2: string = "../assets/H1.jpg";
    imageChange2(event: any){
        this.url2 = event.target.src;
}
url3: string = "../assets/C1.jpg";
    imageChange3(event: any){
        this.url3 = event.target.src;
}


}