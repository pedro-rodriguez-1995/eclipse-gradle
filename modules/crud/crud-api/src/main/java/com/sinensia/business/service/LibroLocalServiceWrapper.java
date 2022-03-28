/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.sinensia.business.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link LibroLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see LibroLocalService
 * @generated
 */
public class LibroLocalServiceWrapper
	implements LibroLocalService, ServiceWrapper<LibroLocalService> {

	public LibroLocalServiceWrapper(LibroLocalService libroLocalService) {
		_libroLocalService = libroLocalService;
	}

	/**
	 * Adds the libro to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect LibroLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param libro the libro
	 * @return the libro that was added
	 */
	@Override
	public com.sinensia.business.model.Libro addLibro(
		com.sinensia.business.model.Libro libro) {

		return _libroLocalService.addLibro(libro);
	}

	/**
	 * Creates a new libro with the primary key. Does not add the libro to the database.
	 *
	 * @param libroId the primary key for the new libro
	 * @return the new libro
	 */
	@Override
	public com.sinensia.business.model.Libro createLibro(long libroId) {
		return _libroLocalService.createLibro(libroId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _libroLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the libro from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect LibroLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param libro the libro
	 * @return the libro that was removed
	 */
	@Override
	public com.sinensia.business.model.Libro deleteLibro(
		com.sinensia.business.model.Libro libro) {

		return _libroLocalService.deleteLibro(libro);
	}

	/**
	 * Deletes the libro with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect LibroLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param libroId the primary key of the libro
	 * @return the libro that was removed
	 * @throws PortalException if a libro with the primary key could not be found
	 */
	@Override
	public com.sinensia.business.model.Libro deleteLibro(long libroId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _libroLocalService.deleteLibro(libroId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _libroLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _libroLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _libroLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _libroLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _libroLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.sinensia.business.model.impl.LibroModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _libroLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.sinensia.business.model.impl.LibroModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _libroLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _libroLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _libroLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.sinensia.business.model.Libro fetchLibro(long libroId) {
		return _libroLocalService.fetchLibro(libroId);
	}

	/**
	 * Returns the libro matching the UUID and group.
	 *
	 * @param uuid the libro's UUID
	 * @param groupId the primary key of the group
	 * @return the matching libro, or <code>null</code> if a matching libro could not be found
	 */
	@Override
	public com.sinensia.business.model.Libro fetchLibroByUuidAndGroupId(
		String uuid, long groupId) {

		return _libroLocalService.fetchLibroByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _libroLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _libroLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _libroLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the libro with the primary key.
	 *
	 * @param libroId the primary key of the libro
	 * @return the libro
	 * @throws PortalException if a libro with the primary key could not be found
	 */
	@Override
	public com.sinensia.business.model.Libro getLibro(long libroId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _libroLocalService.getLibro(libroId);
	}

	/**
	 * Returns the libro matching the UUID and group.
	 *
	 * @param uuid the libro's UUID
	 * @param groupId the primary key of the group
	 * @return the matching libro
	 * @throws PortalException if a matching libro could not be found
	 */
	@Override
	public com.sinensia.business.model.Libro getLibroByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _libroLocalService.getLibroByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the libros.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.sinensia.business.model.impl.LibroModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of libros
	 * @param end the upper bound of the range of libros (not inclusive)
	 * @return the range of libros
	 */
	@Override
	public java.util.List<com.sinensia.business.model.Libro> getLibros(
		int start, int end) {

		return _libroLocalService.getLibros(start, end);
	}

	/**
	 * Returns all the libros matching the UUID and company.
	 *
	 * @param uuid the UUID of the libros
	 * @param companyId the primary key of the company
	 * @return the matching libros, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.sinensia.business.model.Libro>
		getLibrosByUuidAndCompanyId(String uuid, long companyId) {

		return _libroLocalService.getLibrosByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of libros matching the UUID and company.
	 *
	 * @param uuid the UUID of the libros
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of libros
	 * @param end the upper bound of the range of libros (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching libros, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.sinensia.business.model.Libro>
		getLibrosByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.sinensia.business.model.Libro> orderByComparator) {

		return _libroLocalService.getLibrosByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of libros.
	 *
	 * @return the number of libros
	 */
	@Override
	public int getLibrosCount() {
		return _libroLocalService.getLibrosCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _libroLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _libroLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the libro in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect LibroLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param libro the libro
	 * @return the libro that was updated
	 */
	@Override
	public com.sinensia.business.model.Libro updateLibro(
		com.sinensia.business.model.Libro libro) {

		return _libroLocalService.updateLibro(libro);
	}

	@Override
	public LibroLocalService getWrappedService() {
		return _libroLocalService;
	}

	@Override
	public void setWrappedService(LibroLocalService libroLocalService) {
		_libroLocalService = libroLocalService;
	}

	private LibroLocalService _libroLocalService;

}