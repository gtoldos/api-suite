/* $Id: QueryListener.java 163206 2015-12-16 00:07:09Z nwinant $
 */

package com.cyc.query;

/*
 * #%L
 * File: QueryListener.java
 * Project: Core API Object Specification
 * %%
 * Copyright (C) 2013 - 2015 Cycorp, Inc
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

import java.util.List;

/**
 * This interface is one that must be implemented by anyone wishing to listen in
 * on events generated by a Query.
 *
 * @see Query
 * @author tbrussea, zelal
 * @version $Id: QueryListener.java 163206 2015-12-16 00:07:09Z nwinant $
 */
public interface QueryListener {

  /**
   * This method is called when Cyc has created an inference for the query. That
   * means work has begun to find answers.
   *
   * @param query
   */
  public void notifyInferenceCreated(Query query);

  /**
   * This method is called when the inference status has changed.
   *
   * @param oldStatus
   * @param newStatus
   * @param suspendReason
   * @param query
   */
  public void notifyInferenceStatusChanged(InferenceStatus oldStatus, InferenceStatus newStatus,
          InferenceSuspendReason suspendReason, Query query);

  /**
   * Called when new answers have been found.
   *
   * @param query
   * @param newAnswers
   */
  public void notifyInferenceAnswersAvailable(Query query, List<QueryAnswer> newAnswers);

  /**
   * Called when the inference has been terminated.
   *
   * @param query
   * @param exception
   */
  public void notifyInferenceTerminated(Query query, Exception exception);

}
