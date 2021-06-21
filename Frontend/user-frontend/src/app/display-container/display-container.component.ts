import { Component, OnInit } from '@angular/core';
import {User} from '../Interfaces/user';
import {users} from '../mock-data/mock-user';
import { UserService } from '../Services/user.service';
import { map } from 'rxjs/operators';

@Component({
  selector: 'app-display-container',
  templateUrl: './display-container.component.html',
  styleUrls: ['./display-container.component.css']
})
export class DisplayContainerComponent implements OnInit {

  usersData: User[]=[];


  constructor(private service:UserService) { }

  getAllUsers(){
    return this.service.getAllUsers().pipe((
      map(result => {
        [this.usersData]=handleUsers(result);
      })
    ))

  }

  ngOnInit(): void {
    this.getAllUsers().subscribe((result)=>{},(error)=>{alert("Server Error")});
  }


}

function handleUsers(response : any) : [User[]]{
  const res=JSON.parse(JSON.stringify(response));
  const tmpList : User[]=[];

  for(let index in res){
    const tmp=res[index];
    tmpList.push({
      id : tmp[0],
      firstName: tmp[1],
      lastName : tmp[2],
      email: tmp[3],
    })
  }

  return [tmpList];

}
