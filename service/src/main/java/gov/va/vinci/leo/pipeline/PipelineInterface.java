package gov.va.vinci.leo.pipeline;

/*
 * #%L
 * Leo
 * %%
 * Copyright (C) 2010 - 2014 Department of Veterans Affairs
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

import gov.va.vinci.leo.descriptors.LeoAEDescriptor;
import gov.va.vinci.leo.descriptors.LeoTypeSystemDescription;

/**
 * Defines the API for returning a pipeline and the associated type system.
 *
 * Created by ryancornia on 10/7/14.
 */
public interface PipelineInterface {

    /**
     * Get the full Pipeline.
     * @return the pipeline (LeoAEDescriptor) that is made up of 1 or more annotators.
     * @throws Exception
     */
    public LeoAEDescriptor getPipeline() throws Exception;

    /**
     * The full type description for this pipeline.
     * @return the type description for this pipeline.
     * @throws Exception
     */
    public LeoTypeSystemDescription getLeoTypeSystemDescription() throws Exception;
}
