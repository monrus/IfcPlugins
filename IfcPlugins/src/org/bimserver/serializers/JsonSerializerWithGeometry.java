package org.bimserver.serializers;

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

import java.io.OutputStream;

import org.bimserver.emf.IfcModelInterface;
import org.bimserver.emf.SharedJsonSerializer;
import org.bimserver.ifc.IfcSerializer;
import org.bimserver.plugins.serializers.ProgressReporter;
import org.bimserver.plugins.serializers.ProjectInfo;
import org.bimserver.plugins.serializers.SerializerException;

/**
 * @author Ruben de Laat
 * Deprecated, use the JsonStreamingSerializer
 */
@Deprecated
public class JsonSerializerWithGeometry extends IfcSerializer {

	private SharedJsonSerializer sharedJsonSerializer;

	@Override
	public void init(IfcModelInterface model, ProjectInfo projectInfo, boolean normalizeOids) throws SerializerException {
		super.init(model, projectInfo, normalizeOids);
		sharedJsonSerializer = new SharedJsonSerializer(getModel(), true);
	}
	
	@Override
	protected boolean write(OutputStream outputStream, ProgressReporter progressReporter) throws SerializerException {
		return sharedJsonSerializer.write(outputStream, progressReporter);
	}
}