package org.bimserver.ifc.step.deserializer;

/******************************************************************************
 * Copyright (C) 2009-2019  BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see {@literal<http://www.gnu.org/licenses/>}.
 *****************************************************************************/

import java.util.HashSet;
import java.util.Set;

import org.bimserver.emf.Schema;
import org.bimserver.plugins.PluginConfiguration;
import org.bimserver.plugins.deserializers.Deserializer;

/**
 * @author Ruben de Laat
 *	Replaced by the streaming deserializers
 */
@Deprecated
public class Ifc4x3StepDeserializerPlugin extends IfcStepDeserializerPlugin {
	@Override
	public Deserializer createDeserializer(PluginConfiguration pluginConfiguration) {
		return new Ifc4x3StepDeserializer(Schema.IFC4X3);
	}
	
	@Override
	public Set<Schema> getSupportedSchemas() {
		Set<Schema> set = new HashSet<>();
    	set.add(Schema.IFC4X3);
		return set;
	}
}
