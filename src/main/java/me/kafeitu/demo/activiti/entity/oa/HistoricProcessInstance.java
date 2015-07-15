package me.kafeitu.demo.activiti.entity.oa;

import java.util.Date;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * @author yhjhoo
 * @since 1.0
 * date : 11 Jul, 2015
 *
 */
//@Entity
//@Table(name = "ACT_HI_PROCINST")
public class HistoricProcessInstance implements org.activiti.engine.history.HistoricProcessInstance {
	@Id
	@Column(name="ID_")
	private String id;
	
	@Override
	public String getId() {
		return id;
	}

	@Override
	public String getBusinessKey() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getProcessDefinitionId() {
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
	public String getEndActivityId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getStartUserId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getStartActivityId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDeleteReason() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getSuperProcessInstanceId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTenantId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> getProcessVariables() {
		// TODO Auto-generated method stub
		return null;
	}

}
