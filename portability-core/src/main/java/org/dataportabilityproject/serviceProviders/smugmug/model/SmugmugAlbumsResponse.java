/*
 * Copyright 2017 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.dataportabilityproject.serviceProviders.smugmug.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class SmugmugAlbumsResponse {

  @JsonProperty("Uri")
  private String uri;

  @JsonProperty("Locator")
  private String locator;

  @JsonProperty("LocatorType")
  private String locatorType;

  @JsonProperty("Album")
  private List<SmugMugAlbum> albums;

  @JsonProperty("Pages")
  private SmugMugPageInfo pageInfo;

  public List<SmugMugAlbum> getAlbums() {
    return albums;
  }

  public SmugMugPageInfo getPageInfo() {
    return pageInfo;
  }

  public String getUri() {
    return uri;
  }
}