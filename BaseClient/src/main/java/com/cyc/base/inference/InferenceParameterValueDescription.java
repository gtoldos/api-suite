package com.cyc.base.inference;

/*
 * #%L
 * File: InferenceParameterValueDescription.java
 * Project: Base Client
 * %%
 * Copyright (C) 2013 - 2015 Cycorp, Inc.
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

//// Internal Imports

/**
 * <P>InferenceParameterValueDescription is designed to...
 *
 * @author zelal
 * @date August 14, 2005, 12:47 PM
 * @version $Id: InferenceParameterValueDescription.java 155703 2015-01-05 23:15:30Z nwinant $
 */
public interface InferenceParameterValueDescription {

  void setValue(Object value);
  Object getValue();
  String getShortDescription();
  String getLongDescription();
}
