/*
 * Copyright 2018 geoagdt.
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
package uk.ac.leeds.ccg.andyt.generic.data.waas.core;

import java.io.Serializable;

/**
 * @author Andy Turner
 */
public abstract class WaAS_Object implements Serializable {

    /**
     * A reference to LR_Environment
     */
    public transient WaAS_Environment Env;

//    public LR_Object(){
//        Env = new LR_Environment();
//    }
    protected WaAS_Object() {
    }

    public WaAS_Object(WaAS_Environment env) {
        Env = env;
    }
}
