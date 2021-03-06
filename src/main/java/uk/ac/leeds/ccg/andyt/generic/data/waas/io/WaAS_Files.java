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
package uk.ac.leeds.ccg.andyt.generic.data.waas.io;

import java.io.File;
import java.io.Serializable;
import uk.ac.leeds.ccg.andyt.generic.io.Generic_Files;
import uk.ac.leeds.ccg.andyt.generic.data.waas.core.WaAS_Strings;

/**
 *
 * @author geoagdt
 */
public class WaAS_Files extends Generic_Files implements Serializable {

    /**
     *
     * @param s
     */
    public WaAS_Files(WaAS_Strings s) {
        super(s);
    }

    /**
     *
     * @param s
     * @param dataDir
     */
    public WaAS_Files(WaAS_Strings s, File dataDir) {
        super(s, dataDir);
    }

    @Override
    public WaAS_Strings getStrings(){
        return (WaAS_Strings) strings;
    }

    public File getWaASInputDir() {
        File r;
        r = new File(getInputDataDir(), "WaAS");
        r = new File(r, "UKDA-7215-tab");
        r = new File(r, "tab");
        return r;
    }

    public File getGeneratedWaASDir() {
        File dir;
        dir = getGeneratedDataDir();
        File f;
        f = new File(dir, "WaAS");
        f.mkdirs();
        return f;
    }
    
    public File getGeneratedWaASSubsetsDir() {
        File dir;
        dir = getGeneratedWaASDir();
        File f;
        f = new File(dir, "Subsets");
        f.mkdirs();
        return f;
    }

    public File getEnvDataFile() {
        return new File(getGeneratedDataDir(), "Env.dat");
    }
}
