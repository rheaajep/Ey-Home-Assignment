import { Component, OnInit } from '@angular/core';
import {ActivatedRoute} from '@angular/router';
import { map } from 'rxjs/operators';
import { UserService } from '../Services/user.service';
import { SingleUser } from '../Interfaces/single-user';

@Component({
  selector: 'app-view-user-info',
  templateUrl: './view-user-info.component.html',
  styleUrls: ['./view-user-info.component.css']
})
export class ViewUserInfoComponent implements OnInit {
  
  singleUserdata ?: SingleUser;
  userId : number=-1;
  constructor(private activate_route:ActivatedRoute, private service : UserService) { }

  showEditInfo : boolean = false;

  getUserDetails(id : number){
    return this.service.getSingleUser(id).pipe(
      map(
        (result => {
          [this.singleUserdata]=handleUser(result);
        })
      )
    )
  }

  getLinkId(result : any){
    this.userId=result.get('id');

  }

  ngOnInit(): void {
    this.activate_route.paramMap.subscribe(params => {
      this.getLinkId(params)
    })
  }

  showEdit(){
    this.showEditInfo=true;
  }

  onCancel(){
    this.showEditInfo=false;
  }

  refreshPage(data : SingleUser){
    this.singleUserdata=data;
  }


  onSubmit(){
     var editedUser : SingleUser={
       id : this.userId,
       firstname:((document.getElementById("firstname") as HTMLInputElement).value),
       middlename :((document.getElementById("middlename") as HTMLInputElement).value),
       lastname :((document.getElementById("lastname") as HTMLInputElement).value),
       email:((document.getElementById("emai;") as HTMLInputElement).value),
       phoneNos:((document.getElementById("phonenos") as HTMLInputElement).value),
       location:((document.getElementById("location") as HTMLInputElement).value),
       address:((document.getElementById("address") as HTMLInputElement).value),
       linkedIn:((document.getElementById("linkedin") as HTMLInputElement).value)
     }

     this.service.updateUserData(editedUser).subscribe((result)=>{this.showEditInfo=false,alert("Information Updated"),this.refreshPage(editedUser)});
  }

}

function handleUser(response : any) : [SingleUser]{
  const res=JSON.parse(JSON.stringify(response));
  const tmp : SingleUser={ id : res.ID, 
    firstname : res.firstname, 
    middlename : res.middlename, 
    lastname : res.lastname, 
    email : res.email, 
    phoneNos : res.phoneNos, 
    location : res.location, 
    address : res.address, 
    linkedIn : res.linkedIn
  }

  return [tmp];
  
}
