import { Component, OnInit } from '@angular/core';
import {User} from '../Interfaces/user';
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
    this.service.getAllUsers().subscribe((result)=>{});
  }

}

function handleUsers(response : any) : [User[]]{
  const res=JSON.parse(JSON.stringify(response));
  const tmpList : User[]=[];

  for(let index in res){
    const tmp=res[index];
    tmpList.push({
      id : tmp.ID,
      firstName: tmp.firstname,
      lastName : tmp.lastname,
      email: tmp.email,
    })
  }

  return [tmpList];

}
