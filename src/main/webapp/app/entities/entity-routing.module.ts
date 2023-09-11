import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

@NgModule({
  imports: [
    RouterModule.forChild([
      {
        path: 'license-abonnement',
        data: { pageTitle: 'sahiaRabApp.licenseAbonnement.home.title' },
        loadChildren: () => import('./license-abonnement/license-abonnement.routes'),
      },
      /* jhipster-needle-add-entity-route - JHipster will add entity modules routes here */
    ]),
  ],
})
export class EntityRoutingModule {}
