package org.bimserver.ifc.step.serializer;

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

import java.util.Set;

import org.bimserver.emf.Schema;
import org.bimserver.plugins.PluginConfiguration;
import org.bimserver.plugins.SchemaName;
import org.bimserver.plugins.serializers.StreamingSerializer;

public class Ifc4x3StepStreamingSerializerPlugin extends IfcStepStreamingSerializerPlugin {

	@Override
	public StreamingSerializer createSerializer(PluginConfiguration pluginConfiguration) {
		return new Ifc4StepStreamingSerializer(pluginConfiguration);
	}

	@Override
	public Set<Schema> getSupportedSchemas() {
		return Schema.IFC4X3.toSet();
	}

	@Override
	public String getOutputFormat(Schema schema) {
		return SchemaName.IFC_STEP_4X3.name();
	}
}