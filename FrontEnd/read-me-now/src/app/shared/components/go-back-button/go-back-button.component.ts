import { Location } from '@angular/common';
import { Component, inject } from '@angular/core';
@Component({
  selector: 'app-go-back-button',
  standalone: true,
  imports: [],
  templateUrl: './go-back-button.component.html',
  styleUrl: './go-back-button.component.css'
})
export class GoBackButtonComponent {

  private location: Location = inject(Location);

	public goBack(): void {
		this.location.back();
	}
}
