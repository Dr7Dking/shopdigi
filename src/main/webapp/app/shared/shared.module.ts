import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { ShopdigiSharedCommonModule, JhiLoginModalComponent, HasAnyAuthorityDirective } from './';

@NgModule({
  imports: [ShopdigiSharedCommonModule],
  declarations: [JhiLoginModalComponent, HasAnyAuthorityDirective],
  entryComponents: [JhiLoginModalComponent],
  exports: [ShopdigiSharedCommonModule, JhiLoginModalComponent, HasAnyAuthorityDirective],
  schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class ShopdigiSharedModule {
  static forRoot() {
    return {
      ngModule: ShopdigiSharedModule
    };
  }
}
