import { NgModule } from '@angular/core';

import { ShopdigiSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent } from './';

@NgModule({
  imports: [ShopdigiSharedLibsModule],
  declarations: [JhiAlertComponent, JhiAlertErrorComponent],
  exports: [ShopdigiSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent]
})
export class ShopdigiSharedCommonModule {}
