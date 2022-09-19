/*
 * Copyright 2018 Edmunds.com, Inc.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.edmunds.rest.databricks.DTO.jobs;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 *
 */
@Data
public class JobDTO implements Serializable {

  @JsonProperty("job_id")
  private long jobId;
  @JsonProperty("creator_user_name")
  private String creatorUserName;
  @JsonProperty("run_as_user_name")
  private String runAsUserName;
  @JsonProperty("settings")
  private JobSettingsDTO settings;
  @JsonProperty("created_time")
  private Date createdTime;

}
