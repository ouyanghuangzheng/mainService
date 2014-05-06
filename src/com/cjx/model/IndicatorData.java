package com.cjx.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 各项指标的数据
 * 
 * @author CJX
 * 
 */
public class IndicatorData {

	public String name;
	public int indicatorType;
	public List<IndicatorValueItem> value11 = new ArrayList<IndicatorValueItem>();
	public List<IndicatorValueItem> value22 = new ArrayList<IndicatorValueItem>();
	public List<IndicatorValueItem> value33 = new ArrayList<IndicatorValueItem>();
}
