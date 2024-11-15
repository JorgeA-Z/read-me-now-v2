import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BookShelfPageComponent } from './book-shelf-page.component';

describe('BookShelfPageComponent', () => {
  let component: BookShelfPageComponent;
  let fixture: ComponentFixture<BookShelfPageComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [BookShelfPageComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(BookShelfPageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
