package org.bimserver.noprenderengine;

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

import java.io.InputStream;

import org.bimserver.plugins.renderengine.Metrics;
import org.bimserver.plugins.renderengine.RenderEngine;
import org.bimserver.plugins.renderengine.RenderEngineException;
import org.bimserver.plugins.renderengine.RenderEngineModel;

public class NopRenderEngine implements RenderEngine {

	@Override
	public void init() throws RenderEngineException {
	}

	@Override
	public RenderEngineModel openModel(InputStream inputStream, long size) throws RenderEngineException {
		return new NopRenderEngineModel();
	}

	@Override
	public RenderEngineModel openModel(InputStream inputStream) throws RenderEngineException {
		return new NopRenderEngineModel();
	}

	@Override
	public void close() throws RenderEngineException {
	}

	@Override
	public boolean isCalculateQuantities() {
		return false;
	}

	@Override
	public boolean isApplyLayerSets() {
		return false;
	}

	@Override
	public Metrics getMetrics() {
		return null;
	}
}
