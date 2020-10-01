/*
 * The MIT License
 *
 * Copyright 2020 Mark A. Hunter (ACT Health).
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package net.fhirfactory.pegacorn.deployment.properties;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PegacornCoreSubsystemComponentNames {
    private static final String LADON_SUBSYSTEM_DEFAULT = "Ladon";
    private static final String LADON_EXTERNALISED_SERVICE_DEFAULT = "Ladon";
    private static final String LADON_SERVICE_DEFAULT = "Ladon-Core";
    private static final String LADON_PROCESSING_PLANT_DEFAULT = "Ladon-Core";
    private static final String LADON_PROCESSING_PLANT_VERSION = "1.0.0";

    private static final String LADON_EDGE_RECEIVE_FHIR_ALL_FROM_IRIS = "Port:Receive-FHIR-All-From-Iris";
    private static final String LADON_EDGE_FORWARD_FHIR_ALL_TO_IRIS = "Port:Forward-FHIR-All-To-Iris";

    private static final String FHIRPIT_SUBSYSTEM_DEFAULT_PUBLIC = "FHIRPit";
    private static final String FHIRPIT_EXTERNALISED_SERVICE_DEFAULT_PUBLIC = "FHIRPit";
    private static final String FHIRPIT_SERVICE_DEFAULT_PUBLIC = "FHIRPit-Public";
    private static final String FHIRPIT_PROCESSING_PLANT_DEFAULT_PUBLIC = "FHIRPit-Public";

    private static final String FHIRPIT_SUBSYSTEM_DEFAULT = "FHIRPit-Internal";
    private static final String FHIRPIT_EXTERNALISED_SERVICE_DEFAULT = "FHIRPit-Internal";
    private static final String FHIRPIT_SERVICE_DEFAULT = "FHIRPit-Public-Internal";
    private static final String FHIRPIT_PROCESSING_PLANT_DEFAULT = "FHIRPit-Public-Internal";

    private static final String COMMUNICATE_IRIS_DEFAULT = "Communicate-Iris";
    private static final String COMMUNICATE_IRIS_EXTERNALISED_SERVICE_DEFAULT = "Communicate-Iris";
    private static final String COMMUNICATE_IRIS_SERVICE_DEFAULT = "Communicate-Iris";
    private static final String COMMUNICATE_IRIS_PROCESSING_PLANT_DEFAULT = "Communicate-Iris";
    private static final String IRIS_MATRIX_APPLICATION_SERVICES_RECEIVER_PORT_ENDPOINT_NAME = "Iris-MatrixAppServices-Receiver-Port";
    private static final String COMMUNICATE_IRIS_EDGE_RECEIVE_FHIR_ALL_FROM_LADON = "Port:Receive-FHIR-All-From-Ladon";
    private static final String COMMUNICATE_IRIS_EDGE_FORWARD_FHIR_ALL_TO_LADON = "Port:Forward-FHIR-All-To-Ladon";

    private static final String COMMUNICATE_GRPSVR_DEFAULT = "Communicate-GrpSvr";
    private static final String COMMUNICATE_GRPSVR_EXTERNALISED_SERVICE_DEFAULT = "Communicate-GrpSvr";
    private static final String COMMUNICATE_GRPSVR_SERVICE_DEFAULT = "Communicate-GrpSvr";
    private static final String COMMUNICATE_GRPSVR_PROCESSING_PLANT_DEFAULT = "Communicate-GrpSvr";

    private static final String COMMUNICATE_VOIPBRIDGE_DEFAULT = "Communicate-VoIPBridge";
    private static final String COMMUNICATE_VOIPBRIDGE_EXTERNALISED_SERVICE_DEFAULT = "Communicate-VoIPBridge";
    private static final String COMMUNICATE_VOIPBRIDGE_SERVICE_DEFAULT = "Communicate-VoIPBridge";
    private static final String COMMUNICATE_VOIPBRIDGE_PROCESSING_PLANT_DEFAULT = "Communicate-VoIPBridge";

    private static final String COMMUNICATE_AVCONFSVR_DEFAULT = "Communicate-AVConfSvr";
    private static final String COMMUNICATE_AVCONFSVR_EXTERNALISED_SERVICE_DEFAULT = "Communicate-AVConfSvr";
    private static final String COMMUNICATE_AVCONFSVR_SERVICE_DEFAULT = "Communicate-ConfSvr";
    private static final String COMMUNICATE_AVCONFSVR_PROCESSING_PLANT_DEFAULT = "Communicate-ConfSvr";

    private static final String FHIRPLACE_SUBSYSTEM_DEFAULT = "FHIRPlace-Default";
    private static final String FHIRPLACE_EXTERNALISED_SERVICE_DEFAULT = "FHIRPlace-Default";
    private static final String FHIRPLACE_SERVICE_DEFAULT = "FHIRPlace-Default";
    private static final String FHIRPRACE_PROCESSING_PLANT_DEFAULT = "FHIRPlace-Default";

    private static final String HESTIA_AUDIT_SUBSYSTEM_DEFAULT = "Hestia-Audit";
    private static final String HESTIA_AUDIT_EXTERNALISED_SERVICE_DEFAULT = "Hestia-Audit";
    private static final String HESTIA_AUDIT_SERVICE_DEFAULT = "Hestia-Audit";
    private static final String HESTIA_AUDIT_PROCESSING_PLANT_DEFAULT = "Hestia-Audit";

    private static final String HESTIA_DAM_SUBSYSTEM_DEFAULT = "Hestia-DAM";
    private static final String HESTIA_DAM_EXTERNALISED_SERVICE_DEFAULT = "Hestia-DAM";
    private static final String HESTIA_DAM_SERVICE_DEFAULT = "Hestia-DAM";
    private static final String HESTIA_DAM_PROCESSING_PLANT_DEFAULT = "Hestia-DAM";

    private static final String HESTIA_DATASWAMP_SUBSYSTEM_DEFAULT = "Hestia-DataSwamp";
    private static final String HESTIA_DATASWAMP_EXTERNALISED_SERVICE_DEFAULT = "Hestia-DataSwamp";
    private static final String HESTIA_DATASWAMP_SERVICE_DEFAULT = "Hestia-DataSwamp";
    private static final String HESTIA_DATASWAMP_PROCESSING_PLANT_DEFAULT = "Hestia-DataSwamp";

    private static final String EDGE_RECEIVE_FHIR_ALL_ENDPOINT_NAME = "Port:Edge-Receive-FHIR-All";
    private static final String EDGE_RECEIVE_BASE_ENTITIES_ENDPOINT_NAME = "Port:Edge-Receive-Base-Entities";
    private static final String EDGE_RECEIVE_BASE_INDIVIDUALS_ENDPOINT_NAME = "Port:Edge-Receive-Base-Individuals";
    private static final String EDGE_RECEIVE_BASE_MANAGEMENT_ENDPOINT_NAME = "Port:Edge-Receive-Base-Management";
    private static final String EDGE_RECEIVE_BASE_WORKFLOW_ENDPOINT_NAME = "Port:Edge-Receive-Base-Workflow";
    private static final String EDGE_RECEIVE_CLINICAL_CARE_PROVISION_ENDPOINT_NAME = "Port:Edge-Receive-Clinical-CareProvision";
    private static final String EDGE_RECEIVE_CLINICAL_DIAGNOSTICS_ENDPOINT_NAME = "Port:Edge-Receive-Clinical-Diagnostics";
    private static final String EDGE_RECEIVE_CLINICAL_MEDICATIONS_ENDPOINT_NAME = "Port:Edge-Receive-Clinical-Medications";
    private static final String EDGE_RECEIVE_CLINICAL_SUMMARY_ENDPOINT_NAME = "Port:Edge-Receive-Clinical-Summary";
    private static final String EDGE_RECEIVE_FINANCIAL_BILLING_ENDPOINT_NAME = "Port:Edge-Receive-Financial-Billing";
    private static final String EDGE_RECEIVE_FINANCIAL_GENERAL_ENDPOINT_NAME = "Port:Edge-Receive-Financial-General";
    private static final String EDGE_RECEIVE_FINANCIAL_PAYMENT_ENDPOINT_NAME = "Port:Edge-Receive-Financial-Payment";
    private static final String EDGE_RECEIVE_FINANCIAL_SUPPORT_ENDPOINT_NAME = "Port:Edge-Receive-Financial-Support";
    private static final String EDGE_RECEIVE_FOUNDATION_DOCUMENTS_ENDPOINT_NAME = "Port:Edge-Receive-Foundation-Documents";
    private static final String EDGE_RECEIVE_FOUNDATION_OTHER_ENDPOINT_NAME = "Port:Edge-Receive-Foundation-Other";
    private static final String EDGE_RECEIVE_FOUNDATION_TERMINOLOGY_ENDPOINT_NAME = "Port:Edge-Receive-Foundation-Terminology";

    private static final String EDGE_FORWARD_FHIR_ALL_ENDPOINT_NAME = "Port:Edge-Forward-FHIR-All";
    private static final String EDGE_FORWARD_BASE_ENTITIES_ENDPOINT_NAME = "Port:Edge-Forward-Base-Entities";
    private static final String EDGE_FORWARD_BASE_INDIVIDUALS_ENDPOINT_NAME = "Port:Edge-Forward-Base-Individuals";
    private static final String EDGE_FORWARD_BASE_MANAGEMENT_ENDPOINT_NAME = "Port:Edge-Forward-Base_Management";
    private static final String EDGE_FORWARD_BASE_WORKFLOW_ENDPOINT_NAME = "Port:Edge-Forward-Base-Workflow";
    private static final String EDGE_FORWARD_CLINICAL_CARE_PROVISION_ENDPOINT_NAME = "Port:Edge-Forward-Clinical-CareProvision";
    private static final String EDGE_FORWARD_CLINICAL_DIAGNOSTICS_ENDPOINT_NAME = "Port:Edge-Forward-Clinical-Diagnostics";
    private static final String EDGE_FORWARD_CLINICAL_MEDICATIONS_ENDPOINT_NAME = "Port:Edge-Forward-Clinical-Medications";
    private static final String EDGE_FORWARD_CLINICAL_SUMMARY_ENDPOINT_NAME = "Port:Edge-Forward-Clinical-Summary";
    private static final String EDGE_FORWARD_FINANCIAL_BILLING_ENDPOINT_NAME = "Port:Edge-Forward-Financial-Billing";
    private static final String EDGE_FORWARD_FINANCIAL_GENERAL_ENDPOINT_NAME = "Port:Edge-Forward-Financial-General";
    private static final String EDGE_FORWARD_FINANCIAL_PAYMENT_ENDPOINT_NAME = "Port:Edge-Forward-Financial-Payment";
    private static final String EDGE_FORWARD_FINANCIAL_SUPPORT_ENDPOINT_NAME = "Port:Edge-Forward-Financial-Support";
    private static final String EDGE_FORWARD_FOUNDATION_DOCUMENTS_ENDPOINT_NAME = "Port:Edge-Forward-Foundation-Documents";
    private static final String EDGE_FORWARD_FOUNDATION_OTHER_ENDPOINT_NAME = "Port:Edge-Forward-Foundation-Other";
    private static final String EDGE_FORWARD_FOUNDATION_TERMINOLOGY_ENDPOINT_NAME = "Port:Edge-Forward-Foundation-Terminology";

    private static final String EDGE_ANSWER_ENDPOINT_NAME = "Port:Edge-Answer";

    private static final String PETASOS_WATCHDOG_FINALISATION_SERVICE = "Port:Petasos-Watchdog-Finalisation-Service";
    private static final String PETASOS_WATCHDOG_HEARTBEAT_SERVICE = "Port:Petasos-Watchdog-Heartbeat-Service";

    public String getLadonEdgeReceiveFhirAllFromIris() {
        return LADON_EDGE_RECEIVE_FHIR_ALL_FROM_IRIS;
    }

    public String getLadonEdgeForwardFhirAllToIris() {
        return LADON_EDGE_FORWARD_FHIR_ALL_TO_IRIS;
    }

    public String getCommunicateIrisEdgeReceiveFhirAllFromLadon() {
        return COMMUNICATE_IRIS_EDGE_RECEIVE_FHIR_ALL_FROM_LADON;
    }

    public String getCommunicateIrisEdgeForwardFhirAllToLadon() {
        return COMMUNICATE_IRIS_EDGE_FORWARD_FHIR_ALL_TO_LADON;
    }

    public String getPetasosWatchdogFinalisationService() {
        return PETASOS_WATCHDOG_FINALISATION_SERVICE;
    }

    public String getPetasosWatchdogHeartbeatService() {
        return PETASOS_WATCHDOG_HEARTBEAT_SERVICE;
    }

    public String getLadonProcessingPlantVersion() {
        return LADON_PROCESSING_PLANT_VERSION;
    }

    public String getLadonSubsystemDefault() {
        return LADON_SUBSYSTEM_DEFAULT;
    }

    public String getLadonExternalisedServiceDefault() {
        return LADON_EXTERNALISED_SERVICE_DEFAULT;
    }

    public String getLadonServiceDefault() {
        return LADON_SERVICE_DEFAULT;
    }

    public String getLadonProcessingPlantDefault() {
        return LADON_PROCESSING_PLANT_DEFAULT;
    }

    public String getFhirpitSubsystemDefaultPublic() {
        return FHIRPIT_SUBSYSTEM_DEFAULT_PUBLIC;
    }

    public String getFhirpitExternalisedServiceDefaultPublic() {
        return FHIRPIT_EXTERNALISED_SERVICE_DEFAULT_PUBLIC;
    }

    public String getFhirpitServiceDefaultPublic() {
        return FHIRPIT_SERVICE_DEFAULT_PUBLIC;
    }

    public String getFhirpitProcessingPlantDefaultPublic() {
        return FHIRPIT_PROCESSING_PLANT_DEFAULT_PUBLIC;
    }

    public String getFhirpitSubsystemDefault() {
        return FHIRPIT_SUBSYSTEM_DEFAULT;
    }

    public String getFhirpitExternalisedServiceDefault() {
        return FHIRPIT_EXTERNALISED_SERVICE_DEFAULT;
    }

    public String getFhirpitServiceDefault() {
        return FHIRPIT_SERVICE_DEFAULT;
    }

    public String getFhirpitProcessingPlantDefault() {
        return FHIRPIT_PROCESSING_PLANT_DEFAULT;
    }

    public String getCommunicateIrisDefault() {
        return COMMUNICATE_IRIS_DEFAULT;
    }

    public String getCommunicateIrisExternalisedServiceDefault() {
        return COMMUNICATE_IRIS_EXTERNALISED_SERVICE_DEFAULT;
    }

    public String getCommunicateIrisServiceDefault() {
        return COMMUNICATE_IRIS_SERVICE_DEFAULT;
    }

    public String getCommunicateIrisProcessingPlantDefault() {
        return COMMUNICATE_IRIS_PROCESSING_PLANT_DEFAULT;
    }

    public String getCommunicateGrpsvrDefault() {
        return COMMUNICATE_GRPSVR_DEFAULT;
    }

    public String getCommunicateGrpsvrExternalisedServiceDefault() {
        return COMMUNICATE_GRPSVR_EXTERNALISED_SERVICE_DEFAULT;
    }

    public String getCommunicateGrpsvrServiceDefault() {
        return COMMUNICATE_GRPSVR_SERVICE_DEFAULT;
    }

    public String getCommunicateGrpsvrProcessingPlantDefault() {
        return COMMUNICATE_GRPSVR_PROCESSING_PLANT_DEFAULT;
    }

    public String getCommunicateVoipbridgeDefault() {
        return COMMUNICATE_VOIPBRIDGE_DEFAULT;
    }

    public String getCommunicateVoipbridgeExternalisedServiceDefault() {
        return COMMUNICATE_VOIPBRIDGE_EXTERNALISED_SERVICE_DEFAULT;
    }

    public String getCommunicateVoipbridgeServiceDefault() {
        return COMMUNICATE_VOIPBRIDGE_SERVICE_DEFAULT;
    }

    public String getCommunicateVoipbridgeProcessingPlantDefault() {
        return COMMUNICATE_VOIPBRIDGE_PROCESSING_PLANT_DEFAULT;
    }

    public static String getCommunicateAvconfsvrDefault() {
        return COMMUNICATE_AVCONFSVR_DEFAULT;
    }

    public static String getCommunicateAvconfsvrExternalisedServiceDefault() {
        return COMMUNICATE_AVCONFSVR_EXTERNALISED_SERVICE_DEFAULT;
    }

    public static String getCommunicateAvconfsvrServiceDefault() {
        return COMMUNICATE_AVCONFSVR_SERVICE_DEFAULT;
    }

    public static String getCommunicateAvconfsvrProcessingPlantDefault() {
        return COMMUNICATE_AVCONFSVR_PROCESSING_PLANT_DEFAULT;
    }

    public static String getFhirplaceSubsystemDefault() {
        return FHIRPLACE_SUBSYSTEM_DEFAULT;
    }

    public static String getFhirplaceExternalisedServiceDefault() {
        return FHIRPLACE_EXTERNALISED_SERVICE_DEFAULT;
    }

    public static String getFhirplaceServiceDefault() {
        return FHIRPLACE_SERVICE_DEFAULT;
    }

    public static String getFhirpraceProcessingPlantDefault() {
        return FHIRPRACE_PROCESSING_PLANT_DEFAULT;
    }

    public static String getHestiaAuditSubsystemDefault() {
        return HESTIA_AUDIT_SUBSYSTEM_DEFAULT;
    }

    public static String getHestiaAuditExternalisedServiceDefault() {
        return HESTIA_AUDIT_EXTERNALISED_SERVICE_DEFAULT;
    }

    public static String getHestiaAuditServiceDefault() {
        return HESTIA_AUDIT_SERVICE_DEFAULT;
    }

    public static String getHestiaAuditProcessingPlantDefault() {
        return HESTIA_AUDIT_PROCESSING_PLANT_DEFAULT;
    }

    public static String getHestiaDamSubsystemDefault() {
        return HESTIA_DAM_SUBSYSTEM_DEFAULT;
    }

    public static String getHestiaDamExternalisedServiceDefault() {
        return HESTIA_DAM_EXTERNALISED_SERVICE_DEFAULT;
    }

    public static String getHestiaDamServiceDefault() {
        return HESTIA_DAM_SERVICE_DEFAULT;
    }

    public static String getHestiaDamProcessingPlantDefault() {
        return HESTIA_DAM_PROCESSING_PLANT_DEFAULT;
    }

    public static String getHestiaDataswampSubsystemDefault() {
        return HESTIA_DATASWAMP_SUBSYSTEM_DEFAULT;
    }

    public static String getHestiaDataswampExternalisedServiceDefault() {
        return HESTIA_DATASWAMP_EXTERNALISED_SERVICE_DEFAULT;
    }

    public static String getHestiaDataswampServiceDefault() {
        return HESTIA_DATASWAMP_SERVICE_DEFAULT;
    }

    public static String getHestiaDataswampProcessingPlantDefault() {
        return HESTIA_DATASWAMP_PROCESSING_PLANT_DEFAULT;
    }

    public static String getIrisMatrixApplicationServicesReceiverPortEndpointName() {
        return IRIS_MATRIX_APPLICATION_SERVICES_RECEIVER_PORT_ENDPOINT_NAME;
    }

    public static String getEdgeReceiveBaseEntitiesEndpointName() {
        return EDGE_RECEIVE_BASE_ENTITIES_ENDPOINT_NAME;
    }

    public static String getEdgeReceiveBaseIndividualsEndpointName() {
        return EDGE_RECEIVE_BASE_INDIVIDUALS_ENDPOINT_NAME;
    }

    public static String getEdgeReceiveBaseManagementEndpointName() {
        return EDGE_RECEIVE_BASE_MANAGEMENT_ENDPOINT_NAME;
    }

    public static String getEdgeReceiveBaseWorkflowEndpointName() {
        return EDGE_RECEIVE_BASE_WORKFLOW_ENDPOINT_NAME;
    }

    public static String getEdgeReceiveClinicalCareProvisionEndpointName() {
        return EDGE_RECEIVE_CLINICAL_CARE_PROVISION_ENDPOINT_NAME;
    }

    public static String getEdgeReceiveClinicalDiagnosticsEndpointName() {
        return EDGE_RECEIVE_CLINICAL_DIAGNOSTICS_ENDPOINT_NAME;
    }

    public static String getEdgeReceiveClinicalMedicationsEndpointName() {
        return EDGE_RECEIVE_CLINICAL_MEDICATIONS_ENDPOINT_NAME;
    }

    public static String getEdgeReceiveClinicalSummaryEndpointName() {
        return EDGE_RECEIVE_CLINICAL_SUMMARY_ENDPOINT_NAME;
    }

    public static String getEdgeReceiveFinancialBillingEndpointName() {
        return EDGE_RECEIVE_FINANCIAL_BILLING_ENDPOINT_NAME;
    }

    public static String getEdgeReceiveFinancialGeneralEndpointName() {
        return EDGE_RECEIVE_FINANCIAL_GENERAL_ENDPOINT_NAME;
    }

    public static String getEdgeReceiveFinancialPaymentEndpointName() {
        return EDGE_RECEIVE_FINANCIAL_PAYMENT_ENDPOINT_NAME;
    }

    public static String getEdgeReceiveFinancialSupportEndpointName() {
        return EDGE_RECEIVE_FINANCIAL_SUPPORT_ENDPOINT_NAME;
    }

    public static String getEdgeReceiveFoundationDocumentsEndpointName() {
        return EDGE_RECEIVE_FOUNDATION_DOCUMENTS_ENDPOINT_NAME;
    }

    public static String getEdgeReceiveFoundationOtherEndpointName() {
        return EDGE_RECEIVE_FOUNDATION_OTHER_ENDPOINT_NAME;
    }

    public static String getEdgeReceiveFoundationTerminologyEndpointName() {
        return EDGE_RECEIVE_FOUNDATION_TERMINOLOGY_ENDPOINT_NAME;
    }

    public static String getEdgeForwardBaseEntitiesEndpointName() {
        return EDGE_FORWARD_BASE_ENTITIES_ENDPOINT_NAME;
    }

    public static String getEdgeForwardBaseIndividualsEndpointName() {
        return EDGE_FORWARD_BASE_INDIVIDUALS_ENDPOINT_NAME;
    }

    public static String getEdgeForwardBaseManagementEndpointName() {
        return EDGE_FORWARD_BASE_MANAGEMENT_ENDPOINT_NAME;
    }

    public static String getEdgeForwardBaseWorkflowEndpointName() {
        return EDGE_FORWARD_BASE_WORKFLOW_ENDPOINT_NAME;
    }

    public static String getEdgeForwardClinicalCareProvisionEndpointName() {
        return EDGE_FORWARD_CLINICAL_CARE_PROVISION_ENDPOINT_NAME;
    }

    public static String getEdgeForwardClinicalDiagnosticsEndpointName() {
        return EDGE_FORWARD_CLINICAL_DIAGNOSTICS_ENDPOINT_NAME;
    }

    public static String getEdgeForwardClinicalMedicationsEndpointName() {
        return EDGE_FORWARD_CLINICAL_MEDICATIONS_ENDPOINT_NAME;
    }

    public static String getEdgeForwardClinicalSummaryEndpointName() {
        return EDGE_FORWARD_CLINICAL_SUMMARY_ENDPOINT_NAME;
    }

    public static String getEdgeForwardFinancialBillingEndpointName() {
        return EDGE_FORWARD_FINANCIAL_BILLING_ENDPOINT_NAME;
    }

    public static String getEdgeForwardFinancialGeneralEndpointName() {
        return EDGE_FORWARD_FINANCIAL_GENERAL_ENDPOINT_NAME;
    }

    public static String getEdgeForwardFinancialPaymentEndpointName() {
        return EDGE_FORWARD_FINANCIAL_PAYMENT_ENDPOINT_NAME;
    }

    public static String getEdgeForwardFinancialSupportEndpointName() {
        return EDGE_FORWARD_FINANCIAL_SUPPORT_ENDPOINT_NAME;
    }

    public static String getEdgeForwardFoundationDocumentsEndpointName() {
        return EDGE_FORWARD_FOUNDATION_DOCUMENTS_ENDPOINT_NAME;
    }

    public static String getEdgeForwardFoundationOtherEndpointName() {
        return EDGE_FORWARD_FOUNDATION_OTHER_ENDPOINT_NAME;
    }

    public static String getEdgeForwardFoundationTerminologyEndpointName() {
        return EDGE_FORWARD_FOUNDATION_TERMINOLOGY_ENDPOINT_NAME;
    }

    public static String getEdgeReceiveFhirAllEndpointName() {
        return EDGE_RECEIVE_FHIR_ALL_ENDPOINT_NAME;
    }

    public static String getEdgeForwardFhirAllEndpointName() {
        return EDGE_FORWARD_FHIR_ALL_ENDPOINT_NAME;
    }

    public static String getEdgeAnswerEndpointName() {
        return EDGE_ANSWER_ENDPOINT_NAME;
    }
}
