package me.kafeitu.demo.activiti.entity.oa;

import java.util.*;

import javax.persistence.*;

//import org.activiti.engine.history.HistoricTaskInstance;

/**
 * @author yhjhoo
 * @since 1.0
 * date : 11 Jul, 2015
 *
 */

@Entity
@Table(name = "ACT_HI_TASKINST")
public class HistoricTaskInstance implements org.activiti.engine.history.HistoricTaskInstance{
	@Id
	@Column(name="ID_")
	private String id;
	
////	@Column(name="PROC_INST_ID_")
//	@ManyToOne
//	@JoinColumn(name="PROC_INST_ID_")
//	private String processInstanceId;
	
	@Column(name="PROC_INST_ID_")
	private String processInstanceId;

	@Column(name="TASK_DEF_KEY_")
	private String taskDefinitionKey;

	public String getId() {
		return id;
	}

	public String getProcessInstanceId() {
		return processInstanceId;
	}

	@Override
	public String toString() {
		return "HistoricTaskInstance [id=" + id + ", processInstanceId="
				+ processInstanceId + ", taskDefinitionKey="
				+ taskDefinitionKey + "]";
	}

	@Override
	public Date getTime() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getProcessDefinitionId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getExecutionId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDeleteReason() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getOwner() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getAssignee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Date getStartTime() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Date getEndTime() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long getDurationInMillis() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long getWorkTimeInMillis() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Date getClaimTime() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTaskDefinitionKey() {
		return taskDefinitionKey;
	}

	@Override
	public String getFormKey() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getPriority() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Date getDueDate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCategory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getParentTaskId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTenantId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> getTaskLocalVariables() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> getProcessVariables() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
