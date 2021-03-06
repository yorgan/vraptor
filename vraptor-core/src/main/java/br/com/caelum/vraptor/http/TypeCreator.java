/***
 * Copyright (c) 2009 Caelum - www.caelum.com.br/opensource
 * All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 * 	http://www.apache.org/licenses/LICENSE-2.0 
 * 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and 
 * limitations under the License. 
 */

package br.com.caelum.vraptor.http;

import br.com.caelum.vraptor.resource.ResourceMethod;

/**
 * Creates a dynamic class with fields representing parameter methods for the
 * selected method.
 * @see AbstractTypeCreator
 * @author Guilherme Silveira
 */
public interface TypeCreator {

	/**
	 * Returns a type including a field for each one of the parameters from this
	 * method. It also includes a method which .
	 */
	Class<?> typeFor(ResourceMethod method);

	/**
	 * Returns an instance of type generated by typeFor method, with all provided
	 * parameters included.
	 */
	Object instanceWithParameters(ResourceMethod method, Object... parameters);
}
