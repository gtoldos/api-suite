package com.cyc.baseclient.inference.params;

/*
 * #%L
 * File: EnumerationInferenceParameter.java
 * Project: Base Client
 * %%
 * Copyright (C) 2013 - 2016 Cycorp, Inc.
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
//// External Imports
import com.cyc.query.InferenceParameter;
import com.cyc.query.InferenceParameterValueDescription;
import java.util.List;

/**
 * <P>InferenceParameter is designed to...
 *
 * <P>Copyright (c) 2004 - 2006 Cycorp, Inc.  All rights reserved.
 * <BR>This software is the proprietary information of Cycorp, Inc.
 * <P>Use is subject to license terms.
 *
 * @author tbrussea
 * @date August 2, 2005, 10:25 AM
 * @version $Id: EnumerationInferenceParameter.java 163356 2016-01-04 20:55:47Z nwinant $
 */
public interface EnumerationInferenceParameter extends InferenceParameter {

  public List<InferenceParameterValueDescription> getPotentialValues();
}
