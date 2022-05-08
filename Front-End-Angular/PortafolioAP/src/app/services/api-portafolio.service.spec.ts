import { TestBed } from '@angular/core/testing';

import { ApiPortafolioService } from './api-portafolio.service';

describe('ApiPortafolioService', () => {
  let service: ApiPortafolioService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ApiPortafolioService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
