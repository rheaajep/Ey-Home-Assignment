import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { SingleUser } from '../Interfaces/single-user';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  private userUrl='/api/Users';


  constructor(private http: HttpClient) { }

  //get all user info
  getAllUsers(){
    const url=`${this.userUrl}/all`;
    return this.http.get(url);
  }

  //get a single user info
  getSingleUser(id : number){
    const url=`${this.userUrl}?id=${id}`;
    return this.http.get(url);
  }

  //update a user info
  updateUserData(user : SingleUser){
    const url=`${this.userUrl}`;
    const body=JSON.stringify({userUpdate: user});
    return this.http.post(url, body,{headers: new HttpHeaders().set('Content-Type','application/x-www-form-urlencoded')});
  }
}
