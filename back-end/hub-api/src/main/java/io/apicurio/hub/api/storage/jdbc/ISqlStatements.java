/*
 * Copyright 2017 JBoss Inc
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

package io.apicurio.hub.api.storage.jdbc;

import java.util.List;

/**
 * Returns SQL statements used by the JDB storage implementation.  There are different
 * implementations of this interface depending on the database being used.
 * @author eric.wittmann@gmail.com
 */
public interface ISqlStatements {
    
    /**
     * A statement that returns 'true' if the database has already been initialized.
     */
    public String isDatabaseInitialized();

    /**
     * A sequence of statements needed to initialize the database.
     */
    public List<String> databaseInitialization();

    /**
     * A statement used to insert a row into the api_designs table.
     */
    public String insertApiDesign();

    /**
     * A statement used to delete a row from the api_designs table.
     */
    public String deleteApiDesign();

    /**
     * A statement used to select all API designs.
     */
    public String selectApiDesigns();

    /**
     * A statement used to select a single API design by its unique id.
     */
    public String selectApiDesignById();

    /**
     * A statement used to update a single API design.
     */
    public String updateApiDesign();
    
}
