/* Licensed under the Apache License, Version 2.0 (the "License");
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

package org.flowable.form.engine.impl.persistence.entity;

import java.util.List;

import org.flowable.common.engine.impl.persistence.entity.AbstractEngineEntityManager;
import org.flowable.form.engine.FormEngineConfiguration;
import org.flowable.form.engine.impl.persistence.entity.data.FormResourceDataManager;

/**
 * @author Tom Baeyens
 * @author Joram Barrez
 */
public class FormResourceEntityManagerImpl
    extends AbstractEngineEntityManager<FormEngineConfiguration, FormResourceEntity, FormResourceDataManager>
    implements FormResourceEntityManager {

    public FormResourceEntityManagerImpl(FormEngineConfiguration dmnEngineConfiguration, FormResourceDataManager resourceDataManager) {
        super(dmnEngineConfiguration, resourceDataManager);
    }

    @Override
    public void deleteResourcesByDeploymentId(String deploymentId) {
        dataManager.deleteResourcesByDeploymentId(deploymentId);
    }

    @Override
    public void deleteResourcesByName(String name) {
        dataManager.deleteResourcesByName(name);
    }

    @Override
    public FormResourceEntity findResourceByDeploymentIdAndResourceName(String deploymentId, String resourceName) {
        return dataManager.findResourceByDeploymentIdAndResourceName(deploymentId, resourceName);
    }

    @Override
    public List<FormResourceEntity> findResourcesByDeploymentId(String deploymentId) {
        return dataManager.findResourcesByDeploymentId(deploymentId);
    }

}
