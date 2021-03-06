/*
 * Copyright 2013 the original author or authors.
 *
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
 */

package org.gradle.tooling.internal.gradle;

import org.gradle.api.Nullable;
import org.gradle.tooling.model.TaskSelector;

import java.io.File;
import java.io.Serializable;

/**
 * Data used for {@link org.gradle.tooling.model.TaskSelector}.
 */
public class DefaultGradleTaskSelector implements TaskSelector, Serializable {
    private String name;
    private String displayName;
    private String description;
    private File projectDir;

    public String getName() {
        return name;
    }

    public DefaultGradleTaskSelector setName(String name) {
        this.name = name;
        return this;
    }

    @Nullable
    public String getDescription() {
        return description;
    }

    public DefaultGradleTaskSelector setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDisplayName() {
        return displayName;
    }

    public DefaultGradleTaskSelector setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    public File getProjectDir() {
        return projectDir;
    }

    public DefaultGradleTaskSelector setProjectDir(File projectDir) {
        this.projectDir = projectDir;
        return this;
    }

    @Override
    public String toString() {
        return "GradleTaskSelector{"
                + "name='" + name + "' "
                + "projectDir='" + projectDir + "'}";
    }
}
