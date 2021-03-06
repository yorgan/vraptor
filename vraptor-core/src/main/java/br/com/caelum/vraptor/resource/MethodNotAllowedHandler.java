/***
 * Copyright (c) 2009 Caelum - www.caelum.com.br/opensource
 * All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package br.com.caelum.vraptor.resource;

import java.util.EnumSet;

import br.com.caelum.vraptor.core.RequestInfo;

/**
 * Handler for Method Not Allowed Http Status (405).
 *
 * @author Lucas Cavalcanti
 * @author Caio Filipini
 */
public interface MethodNotAllowedHandler {

	/**
	 * Denies current request due to method not allowed.
	 * @param request
	 * @param allowedMethods
	 */
	void deny(RequestInfo request, EnumSet<HttpMethod> allowedMethods);

}
