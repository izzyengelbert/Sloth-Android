package com.example.database.query;


import com.example.database.dao.TimerDAO;
import com.example.database.data.Data;
import com.example.database.model.TimerModel;

import java.sql.SQLException;


public class TimerUpdateQuery extends Query
{
	private TimerModel mTimer;


	public TimerUpdateQuery(TimerModel timer)
	{
		mTimer = timer;
	}


	@Override
	public Data<Integer> processData() throws SQLException
	{
		Data<Integer> data = new Data<>();
		data.setDataObject(TimerDAO.update(mTimer));
		return data;
	}
}
