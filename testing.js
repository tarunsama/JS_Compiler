function TopLevelModel() 
{	
	var nop = 5;//standard.view.standard_simod_page_view_dynamic.page_count;
	var tp = 103;//standard.view.standard_simod_page_view_dynamic.tp;
	var no_of_visits_overall = 0;//standard.view.repeat_visitor_page_view.no_of_visits_overall;
	var result = '';
	var mainModelResponse = false;
	var praas_repeat_visit = '';
	var no_of_visits_cond0 = (no_of_visits_overall === 0)
	var no_of_visits_cond1 = (no_of_visits_overall >0)
	if (no_of_visits_cond0) 
	{
		praas_repeat_visit =  0;
	} 
 
	else if (no_of_visits_cond1) 
	{
		praas_repeat_visit =  1;
	} 
	if(tp === '103')
	{
		if(nop > 5)
		{
			result = 'proactive';
		}			
		else
		{
			if (praas_repeat_visit === '0') 
			{
				mainModelResponse = bestbuy['function'].MainModel_segment_1.output_flag;
				if(mainModelResponse)
					result = 'proactive';
			}
			else if (praas_repeat_visit === '1') 
			{
				mainModelResponse = bestbuy['function'].MainModel_segment_2.output_flag;
				if(mainModelResponse)
					result = 'proactive';
			}
		}
	}
	return result;
}
TopLevelModel();