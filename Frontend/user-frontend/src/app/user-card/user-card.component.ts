import { Component, OnInit, Input} from '@angular/core';
import {User} from '../Interfaces/user';

@Component({
  selector: 'app-user-card',
  templateUrl: './user-card.component.html',
  styleUrls: ['./user-card.component.css']
})
export class UserCardComponent implements OnInit {

  @Input() userData: User={
    id : -1,
    firstName : "",
    lastName : "",
    email : ""
  };

  constructor() { }

  ngOnInit(): void {
  }

}
