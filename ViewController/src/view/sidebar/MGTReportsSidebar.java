package view.sidebar;

import java.io.Serializable;

import javax.faces.event.ActionEvent;

import oracle.adf.controller.TaskFlowId;

public class MGTReportsSidebar implements Serializable {
    private String taskFlowId = "/WEB-INF/Task_Flows/Modules/MGT_Reports/MGT_Reports_TaskFlow.xml#MGT_Reports_TaskFlow";
    private String taskFlowId1 =
        "/WEB-INF/Task_Flows/Modules/MGT_Reports/MGT_Reports_TaskFlow.xml#MGT_Reports_TaskFlow";


    public MGTReportsSidebar() {
    }

    public TaskFlowId getDynamicTaskFlowId() {
        return TaskFlowId.parse(taskFlowId);
    }

    public void setDynamicTaskFlowId(String taskFlowId) {
        this.taskFlowId = taskFlowId;
    }
    
    public void fragmentCall(ActionEvent actionEvent) {
        // Add event code here...
        String action = (String)actionEvent.getComponent().getAttributes().get("link");
        StringBuilder link = new StringBuilder();
        link.append("/WEB-INF/Task_Flows/Modules/MGT_Reports/");
        link.append(action);
        link.append(".xml#");
        link.append(action);
        setDynamicTaskFlowId(link.toString());
    }

    public TaskFlowId getDynamicTaskFlowId1() {
        return TaskFlowId.parse(taskFlowId1);
    }

    public void setDynamicTaskFlowId1(String taskFlowId) {
        this.taskFlowId1 = taskFlowId;
    }
}
