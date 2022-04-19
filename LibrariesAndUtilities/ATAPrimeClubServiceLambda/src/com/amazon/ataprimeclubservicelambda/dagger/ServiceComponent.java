package com.amazon.ataprimeclubservicelambda.dagger;

import com.amazon.ataprimeclubservicelambda.activity.GetPrimeBenefitsActivity;

import javax.inject.Singleton;

@Singleton
//@Component(modules = {MetricsModule.class})
public interface ServiceComponent {
    //MetricsHandler metricsHandler();

    GetPrimeBenefitsActivity getPrimeBenefitsActivity();
}
