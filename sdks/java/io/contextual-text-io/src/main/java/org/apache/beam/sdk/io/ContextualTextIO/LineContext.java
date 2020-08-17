/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.beam.sdk.io.ContextualTextIO;

import com.google.auto.value.AutoValue;
import org.apache.beam.sdk.annotations.Experimental;
import org.apache.beam.sdk.annotations.Internal;
import org.apache.beam.sdk.schemas.AutoValueSchema;
import org.apache.beam.sdk.schemas.annotations.DefaultSchema;

@Internal
@Experimental(Experimental.Kind.SCHEMAS)
@DefaultSchema(AutoValueSchema.class)
@AutoValue
public abstract class LineContext {
    public abstract Range getRange();

    public abstract Long getLineNum();

    public abstract String getLine();

    public abstract Builder toBuilder();

    public abstract String getFile();

    public static Builder newBuilder() {
        return new AutoValue_LineContext.Builder();
    }

    @AutoValue.Builder
    public abstract static class Builder {
        public abstract Builder setRange(Range range);

        public abstract Builder setLineNum(Long lineNum);

        public abstract Builder setLine(String line);

        public abstract Builder setFile(String file);

        public abstract LineContext build();
    }
}